# homeworkJavaOOP4
Задание на тему Интерфейс

Основной уровень
1) Дополните реализацию группы Студентов (задание прошлой лекции) возможностью сортировки
массива студентов по фамилии. Для этого в класс Группа добавьте метод
sortStudentsByLastName().

2) Создайте отдельный класс который реализует считывание характеристик студента с клавиатуры
(имя, фамилии и т. д.). Создание и возврат студента на основе считанных данных. Используете
методы этого класса для считывания и добавления студента в группу.

Продвинутый уровень
1) Объявите интерфейс

public interface CSVConverter{
public String toCSVString();
public Student fromCSVString (String str);
}

Класс Студент должен реализовывать этот интерфейс. Логика реализации следующая — на
основе Студента создать строку с его CSV представлением и наоборот на основе этой строки
создать Студента.
