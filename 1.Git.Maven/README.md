<p>1. Изменил структуру нашей библиотеки так, чтобы все было внутри папки, совпадающей с groupId в pom. Попробуйте еще раз собрать и подцепить в другом проекте.</p>
<p>2. В корневой папке репозитория, в папке misc, можете найти скриншот, который объясняет ту магию с успешным применением method reference при проверке отсортированности массива.</p>
<h5>Непосредственно домашка:</h5>
<p>Сделать 'multi-module' maven проект со следующей структурой модулей:</p>
-parent<br>
---A depends on B, C<br>
---B depends on C<br>
---C
<p>Смысловая нагрузка между модулями приветствуется, то есть если один модуль зависит от другого, он должен как-то его использовать в коде.</p>
<h5>Я в вас верю :)</h5>
