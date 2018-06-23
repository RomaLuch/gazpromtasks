package solution3;



public class Solution {
/*Дело в том, что в секции try - метода CreateUser в этой строчке:
 objCASoap.SignRequestCA("1",privateKey, cert);
 мы вызываем метод SignRequestCA не у нашего объекта, а у нового объекта objCASoap
 соотетственно все методы по изменению лога:
  private void setErrorLog(String logString)
  private void setLog(String logString)

  работают не с полем нашего объекта objResponseCASoap, а с полем objResponseCASoap объекта objCASoap

  Если мы попали в секцию catch метода CreateUser, то метод setErrorLog так же вызовется не у нашего объекта,
 а совсем у другого (objCASoap), который никак не изменит поле нашего объекта objResponseCASoap.
 */
}
