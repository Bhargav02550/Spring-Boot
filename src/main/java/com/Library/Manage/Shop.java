package com.Library.Manage;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Shopping")
@NoArgsConstructor
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Shop {
    @Id
    private ObjectId id;
    private String name;
    private String number;
    private List<SubItem> items;

    public Shop(ObjectId id, String name, String number, List<SubItem> items) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.items = items;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public List<SubItem> getItems() {
        return items;
    }

    public void setItems(List<SubItem> items) {
        this.items = items;
    }

    @NoArgsConstructor
    @Data
    public static class SubItem {
        private String itemname;
        private String itemdis;
        private String imageurl;
        private String price;
    }
}
