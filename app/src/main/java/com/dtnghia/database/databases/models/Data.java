package com.dtnghia.database.databases.models;

public class Data {
    public static final String TABLE_NAME = "default_sentences";

    public static final String COLUMN_ID = "id";
    public static final String COLUMN_SHAPE = "shape";
    public static final String COLUMN_SENTENCE = "sentence";

    private int id;
    private String shape;
    private String sentence;



    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_SHAPE + " TEXT,"
                    + COLUMN_SENTENCE + " TEXT"
                    + ")";

    public Data() {
    }

    public Data(int id, String shape, String sentence) {
        this.id = id;
        this.shape = shape;
        this.sentence = sentence;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }
}