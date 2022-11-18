package Task2.data.constant;

public enum ResourceConst {
    APPLIANCES_DB_XML("appliances_db.xml");

    private final String fileName;

    private ResourceConst(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }
}
