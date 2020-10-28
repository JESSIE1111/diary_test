package com.swufe.diary_test;


public class DiaryActivity {
    private Integer id;
    private String title;
    private String createtime;
    private String content;

    public DiaryActivity(){

    }

    public DiaryActivity(Integer id, String title, String createtime, String content){
        this.id=id;
        this.title=title;
        this.createtime=createtime;
        this.content=content;
    }

    public Integer getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public String getCreatetime() {
        return createtime;
    }

    public String getTitle() {
        return title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setCreatetime(String createtime) {
        this.createtime = createtime;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
