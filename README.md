# hwJavaOop1
## Домашнее задание находиться в папке src

> Проблемы проектирования:
* Родительский класс содержит методы связанные с разным поведением животных, из-за чего необходимо переопределять в наследниках почти все эти методы родителя
* Названия методов определены плохо (*к примеру: непонятно какую функцию определяет метод ***toGo*** идти на ногах/ползти/бежать или просто двигаться*)
* Хоть поля являются приватными, но все доступны через геттеры и сеттеры, что нарушает инкапсуляцию (*наверно так только у меня, можно было бы их убрать вовсе*)
* В родительском классе: Animal есть конструктор, с именем, который принимает имя, но ставит цвет и количество ног по умолчанию, следовательно это может привести к неверному поведению какого-либо объекта

> Вопросы к преподавателю:
1. Не разобрался как в гит-идеи закидывать только файлы внутри папки src, работал до этого в VSC, просто отмечал файлы и пушил. Может нужно использовать гитигнор?
2. в части родительского кода, например в методе toGo:
```java
    public void toGo() {
        System.out.printf("(%s) %s is moving now; \n", getType(), name);
    }
Необходимо ли ставить this. перед name?
```
3. Не очень понимаю зачем в этой части кода, например класса *Cat* 'super'.
```java
public Cat(String name, String colour) {
        super (name, colour, 4);
    }
    public Cat (String name) {
        this(name, "transparent");
    }
```
понимаю так - нам нужен для того, чтобы мы вызывали конструктор Animal внутри конструктора Cat, но потом мы вызываем ещё один конструктор, куда передаём только имя, а цвет задаётся в этот же конструкторе...
Не ясна цель использования...
