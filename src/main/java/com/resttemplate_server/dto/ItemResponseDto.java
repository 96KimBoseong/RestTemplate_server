package com.resttemplate_server.dto;

import com.resttemplate_server.model.Item;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ItemResponseDto {
    private final List<Item> items = new ArrayList<>();

    public void setItems(Item item) {
        items.add(item);
    }
}
