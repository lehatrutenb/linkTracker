# LinkTracker

LinkTracker – Telegram-бот, который отслеживает изменения на веб-страницах и оперативно информирует пользователя о них.

## Как запустить?

1. Telegram bot - задайте ваш [токен](https://help.botman.pro/article/23763) в переменную окружения, перейдите в директорию bot-а и запустите spring проект

```bash
export TELEGRAM_TOKEN="...your_telegram_bot_token..."
cd bot
../mvnw spring-boot:run
```

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
