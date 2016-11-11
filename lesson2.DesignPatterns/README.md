# Design Patterns

## intro about what patterns are

1. Decorator
2. Singleton
3. Prototype
4. Factory method
5. IoC(ideology)
6. Builder


## Homework
0. 
    * [читаем книгу] (https://vk.com/doc-123686185_437603556?hash=a4379cd055efce78f6&dl=1c66545b31f0cceafc)
    * [смотрим видео про IoC] (http://www.youtube.com/watch?v=ZdBwF26oWhs)

1. Прочитать про: 
	* Strategy
	* Abstract factory
	* Observer
	* Chain Of Responsibility
	* Adapter
	
2. Code
    * Создать уникальный декоратор с Reader'ом
      Кто -то может взять пример с пары, но так, чтобы он работал с кириллицей
    * Создать при помощи паттерна chain of responsibility Логгер
        Сообщение приходит в логгер. Сообщение вида "[LEVEL] : [TEXT]", где
	    Level 1 - INFO
	    Level 2 - WARN
	    Level 3 - ERROR
	   Если ссобщение ERROR, то работает INFO- и ERROR- логгеры
	   Если сообщение WARN, то WARN-логгер
	   Если сообщение INFO, то INFO-логгер
	   
3. ## Задача(советую не гуглить, лучше просто не делайте тогда)
Есть большой массив из чисел. Каждое число встречается два раза, а какое-то один.
Найти это число за один проход по массиву с константными затратами памяти (то есть не зависящими от размера массива).

** А теперь в массиве два числа, каждое из которых встречается один раз.
   Найти их при за О(n) и константную память.