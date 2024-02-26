
/*В классе App допишите публичный статический метод checkSecurity(), который проверяет безопасность соединения с переданным url.
В качестве параметра метод принимает url - объект класса Url.
Если протокол "https", то соединение считается безопасным, если "http", то нет.
Метод должен вернуть строку вида "Connection to 'host_name' is secure",
если соединение безопасно или "Connection to 'host_name' is not secure", если не безопасно.
Вместо 'host_name' нужно подставить имя хоста.*/

class App {

    public static void main(String[] args) {
        Url typedUrl = new Url("https://google.com");
        System.out.println(checkSecurity(typedUrl));
    }

    public static String checkSecurity(Url url) {
        String protocol = url.getProtocol();
        String hostName = url.getHost();
            if (protocol.equals("https")) {
                return "Connection to " + hostName + " is secure";
            } else {
                return "Connection to " + hostName + " is not secure";
            }

    }

}
