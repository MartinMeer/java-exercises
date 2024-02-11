import java.util.Arrays;

/*Реализуйте класс Url, который описывает переданный в конструктор HTTP адрес
и позволяет извлекать из него части – протокол и имя хоста.
Конструктор класса принимает url в виде строки вида "https://google.com".
В классе реализуйте два геттера:
getProtocol() - возвращает протокол
getHost() - возвращает имя хоста*/
class Url {
    private String url;

    Url (String url) {
       this.url = url;
       }
   public String getProtocol() {
       return url.substring(0, url.indexOf(':'));
   }
    public String getHost() {
        return url.substring(url.indexOf(':') + 3);
    }


}
