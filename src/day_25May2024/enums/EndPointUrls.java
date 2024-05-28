package day_25May2024.enums;

public enum EndPointUrls {

    HOME("Home page","www.vwo.com/home"),
    LOGIN("Login page","www.vwo.com/login"),
    DASHBOARD("Dashboard page","www.vwo.com/dashboard");
    private String url;
    private String name;

    EndPointUrls(String name, String url) {
        this.url = url;
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
