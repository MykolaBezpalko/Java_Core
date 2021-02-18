/*
*  Клас, для кастомної обробки помилок при вводі.
* */

package task1;

class MyInputException extends Exception{
    /**
    Приймає в себе стрічку, яка буде виводитись в консолі
    при виникненні помилики
    */
    MyInputException(String str){
        System.err.print(str);
    }
}
