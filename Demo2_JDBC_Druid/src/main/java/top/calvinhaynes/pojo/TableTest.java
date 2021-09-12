package top.calvinhaynes.pojo;


/**
 * 实体类
 *
 * @author CalvinHaynes
 * @date 2021/09/07
 */
public class TableTest {
    private int id;
    private String name;
    private int level;
    private String create_time;
    private int delete_flag;
    private String extension;

    /**
     * Instantiates a new Table test.
     */
    public TableTest() {
    }

    /**
     * Instantiates a new Table test.
     *
     * @param id          the id
     * @param name        the name
     * @param level       the level
     * @param create_time the create time
     * @param delete_flag the delete flag
     * @param extension   the extension
     */
    public TableTest(int id, String name, int level, String create_time, int delete_flag, String extension) {
        this.id = id;
        this.name = name;
        this.level = level;
        this.create_time = create_time;
        this.delete_flag = delete_flag;
        this.extension = extension;
    }

    /**
     * Gets id.
     *
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets level.
     *
     * @return the level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets level.
     *
     * @param level the level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Gets create time.
     *
     * @return the create time
     */
    public String getCreate_time() {
        return create_time;
    }

    /**
     * Sets create time.
     *
     * @param create_time the create time
     */
    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    /**
     * Gets delete flag.
     *
     * @return the delete flag
     */
    public int getDelete_flag() {
        return delete_flag;
    }

    /**
     * Sets delete flag.
     *
     * @param delete_flag the delete flag
     */
    public void setDelete_flag(int delete_flag) {
        this.delete_flag = delete_flag;
    }

    /**
     * Gets extension.
     *
     * @return the extension
     */
    public String getExtension() {
        return extension;
    }

    /**
     * Sets extension.
     *
     * @param extension the extension
     */
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
