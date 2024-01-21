package com.gj.lms;

public class UpdatePageDto {
    private int id;
    private int page;

    public UpdatePageDto() {
        super();
    }

    public UpdatePageDto(int id, int page) {
        this.id = id;
        this.page = page;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
