package top.calvinhaynes.pojo;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: CalvinHaynes
 * Date: 2021-07-26
 * Time: 14:28
 */
public class TableTest {
    private int id;
    private String name;
    private int level;
    private String create_time;
    private int delete_flag;
    private String extension;

    public TableTest() {
    }

    public TableTest(int id, String name, int level, String create_time, int delete_flag, String extension) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.create_time = create_time;
        this.delete_flag = delete_flag;
        this.extension = extension;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public int getDelete_flag() {
        return delete_flag;
    }

    public void setDelete_flag(int delete_flag) {
        this.delete_flag = delete_flag;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    @Override
    public String toString() {
        return "TableTest{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", level=" + level +
                ", create_time='" + create_time + '\'' +
                ", delete_flag=" + delete_flag +
                ", extension='" + extension + '\'' +
                '}';
    }
}
