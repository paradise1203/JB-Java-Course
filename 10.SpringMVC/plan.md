# Spring MVC

[Документация] (http://docs.spring.io/spring-framework/docs/current/spring-framework-reference/html/mvc.html)

![MVC concept] (../misc/spring-mvc-concepts.jpg)

## План
* Паттерн MVC
* Настройка Spring MVC
 - DispatcherServlet
 - contextConfiguration
* Создание контроллера
 - Включение поддержки аннотаций
 - Настройка ViewResolver
* Контроллеры с входными данными
* Немного о JSP


## Useful Links

[Страница проекта Spring MVC](http://projects.spring.io/spring-framework/)

[Туториал с примерами](http://www.tutorialspoint.com/spring/spring_web_mvc_framework.htm)

[Введение в JSP](http://www.codenet.ru/webmast/java/jsp.php)

## Домашнее задание

1) Читать про GET, POST. Посмотреть синтаксис JSP. Побаловаться с контроллерами и попробовать решить предыдущее ДЗ на Spring MVC.

2) Есть список данных, к примеру:

Имя! |	Фамилия! |	Отчество! |	Дата рождения (в произвольном виде) |	Пол
-----|----------|-----------|-------------------------------------|----


Восклицательным знаком (!) отмечены обязательные поля. Если одного из этих полей нету, запись не выводится. Проверка на валидность производится на клиентской части.

Механизм ввода данных произвольный.

Структура:

Есть начальная страница. На ней есть одна кнопка Submit/OK/Поехали (на ваш вкус).
На этой странице вы можете наполнить таблицу данными, так как вы считаете нужным.
Желательно описать как именно заполнить таблицу.
После нажатия на которую идет переход на другую страницу с таблицей.

Использовать MVC, Controller
```Java
 @RequestMapping, @RequestParam, @PathVariable // по мере надобности
```
