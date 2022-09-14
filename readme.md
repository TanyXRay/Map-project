# Работа с коллекцией HashMap<E>.

##### В данном проекте представлен текст:
- *"Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum."*

##### По задумке необходимо определить, какая буква встречалась в вышеуказанном тексте чаще всего и какая реже всего. Определить, является ли символ буквой с использованием встроенного статического метода Character.isLetter. Найти минимальное и максимальное значение в мапе.
##### Структура программы:
- *в Main создано статическое текстовое поле с содержимым из текста выше.*
- *Создана мапа Map<Character, Integer>, в которой для каждого символа хранится количество раз, которое встретили. Изначально мапа пустая.*
- *Для каждого символа проверяем в цикле, есть ли он в мапе. Может быть два случая:*
  >1) Его нет в мапе. Значит, мы встретили его в первый раз и вставляем в мапу пару где ключ это наш символ, а значение это 1 (тк встретили его всего один раз).
  >2) Он есть в мапе. Значит он нам уже встречался. Вынимаем текущее значение для ключа (нашего символа), увеличиваем это число на 1 и вставляем обратно в мапу.
- *В итоге после цикла у нас будет мапа частот, с которой встречаются символы.*
- *Далее необходимо найти минимальное и максимальное значение в мапе.*
##### В main продемонстрирована работа с коллекцией.