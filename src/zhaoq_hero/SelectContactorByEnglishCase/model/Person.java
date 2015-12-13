package zhaoq_hero.SelectContactorByEnglishCase.model;

/**
 * Project_name : SelectContactorByEnglishCase
 * Author : zhaoQiang
 * Email : zhaoq_hero@163.com
 * Create_time : 2015/12/12 | 20:08
 */
public class Person {
    //联系人  实体类：
    private String name;
    private String pinYinName;

    public Person(String name) {
        super();
        this.name = name;
    }

    public Person(String name, String pinYinName) {
        super();
        this.name = name;
        this.pinYinName = pinYinName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPinYinName() {
        return pinYinName;
    }

    public void setPinYinName(String pinYinName) {
        this.pinYinName = pinYinName;
    }
}
