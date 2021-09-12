package top.calvinhaynes.entity;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * @ProjectName: Ingredient
 * @Author: CalvinHaynes
 * @Date: 2021/7/30 9:26
 * @Description: 配料实体类
 */
@Data
@RequiredArgsConstructor
public class Ingredient {

    private final String id;
    private final String name;
    private final Type type;

    //枚举类Type
    public static enum Type {
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}
