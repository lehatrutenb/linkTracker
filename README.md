# LinkTracker

LinkTracker – Telegram-бот, который отслеживает изменения на веб-страницах и оперативно информирует пользователя о них.

## Как запустить?

1. Поднимите PostgreSQL и примените миграции (из корня репозитория):

```bash
cd infra
docker compose up
```

2. Задайте переменные окружения:

- `TELEGRAM_TOKEN` — [токен бота](https://help.botman.pro/article/23763)
- для скраппера: `GITHUB_TOKEN`, `STACKOVERFLOW_KEY`, `STACKOVERFLOW_ACCESS_KEY`

3. Запустите скраппер (порт 8081), затем бота (порт 8080) — каждый в своём терминале, из корня репозитория:

```bash
cd scrapper
export GITHUB_TOKEN="..."
export STACKOVERFLOW_KEY="..."
export STACKOVERFLOW_ACCESS_KEY="..."
../mvnw spring-boot:run -Dspring-boot.run.arguments="--spring.docker.compose.enabled=false --spring.liquibase.enabled=false"
```

```bash
cd bot
export TELEGRAM_TOKEN="..."
../mvnw spring-boot:run -Dspring-boot.run.arguments="--spring.docker.compose.enabled=false --spring.liquibase.enabled=false"
```

Я использую `--spring.docker.compose.enabled=false --spring.liquibase.enabled=false` чтобы сервисы при разработе удобно
локально поднимать со всеми зависимостями - эти аргументы так же можно указать и при запуске в vscode/intellij

База по умолчанию: `localhost:5432`, БД `linktracker`, пользователь `postgres` / пароль `postgres` (как в `infra/compose.yaml` и `application.yaml`).

## Какие ссылки подразумеваются для скраппинга?

### Github

- Ссылки на репозиторий - будет выхватывать все события над ним

Примеры

https://github.com/openclaw/openclaw

### Stackoverflow

- Ссылки на вопросы - будет выхватывать ответы на вопросы

Примеры

https://stackoverflow.com/questions/4568645/printing-1-to-1000-without-loop-or-conditionals

https://stackoverflow.com/questions/4568645
