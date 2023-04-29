package kg.megalab;

import service.RestService;

public class App {
    public static void main(String[] args) {
        RestService restService = new RestService();
        System.out.println(restService.run("https://www.7timer.info/bin/astro.php?lon=74.59&lat=42.88&ac=0&unit=metric&output=json&tzshift=0"));

    }
}