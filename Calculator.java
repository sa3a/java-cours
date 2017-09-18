/**
 Класс реализует калькулятор.
*/
public class Calculator{

/**
Результат вычисления.
*/
private int result;
/**
Суммируем аргументы.
@param params аргументы суммирования.
*/
public void add(int... params){
for(Integer param:params){
this.result+=param;
}
}
/**
Получитьолучить результат.
@return результат вычисления.
*/
public int getResult(){
return this.result;
}
/**
Очистить реализует вычисления.
*/
public void cleanResult(){
this.result = 0;
}
}