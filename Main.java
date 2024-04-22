// Напишите приложение, которое будет запрашивать у пользователя следующие данные, разделенные пробелом:
// Фамилия Имя Отчество дата _ рождения номер _ телефона пол
// Форматы данных:
// фамилия, имя, отчество - строки
// дата _ рождения - строка формата dd.mm.yyyy
// номер _ телефона - целое беззнаковое число без форматирования
// пол - символ латиницей f или m.

// Приложение должно проверить введенные данные по количеству. 
// Если количество не совпадает, вернуть код ошибки, обработать его и показать пользователю сообщение, 
// что он ввел меньше и больше данных, чем требуется.

// Приложение должно распарсить полученную строку и выделить из них требуемые значения. 
// Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы.
// Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано, 
// пользователю выведено сообщение с информацией, что именно неверно.

// Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, 
// в него в одну строку должны записаться полученные данные, вида
// <Фамилия> <Имя> <Отчество> <дата _ рождения> <номер _ телефона> <пол>

// Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
// Не забудьте закрыть соединение с файлом.
// При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, 
// пользователь должен увидеть стектрейс ошибки.

class Main{
    public static void main(String[] args) {
        System.out.println("Correct input info:");
        Information person1 = new Person();
        person1.setInfo("Petrov Petr Petrovich 22.02.2000 8495928481 m");
        System.out.println(person1);
        person1.splitInfo();

        System.out.println("\nIncorrect input phone_number:");
        Information person2 = new Person();
        person2.setInfo("Petrov Petr Petrovich 22.02.2000 phone m");
        System.out.println(person2);
        person2.splitInfo();

        System.out.println("\nIncorrect input date:");
        Information person3 = new Person();
        person3.setInfo("Petrov Petr Petrovich 20.20 8495928481 m");
        System.out.println(person3);
        person3.splitInfo();

        System.out.println("\nCorrect input info:");
        Information person4 = new Person();
        person4.setInfo("Petrov Ivan Petrovich 25.04.2002 849594321 m");
        System.out.println(person4);
        person4.splitInfo();

        System.out.println("\nCorrect input info:");
        Information person5 = new Person();
        person5.setInfo("Ivanov Ivan Petrovich 25.04.2002 849594321 m");
        System.out.println(person5);
        person5.splitInfo();

    }
}