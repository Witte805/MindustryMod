package example; // 请务必改为你的实际包名

import mindustry.type.Item;

public class MyItems {
    // 定义一个公开静态的Item变量，这就是你的新物品
    public static Item myCustomItem;

    // 这个方法用于加载（初始化）这个物品
    public static void load() {
        myCustomItem = new Item("my-custom-item") {{
            // 以下是物品属性，可根据需要调整
            color = mindustry.graphics.Pal.lightishGray; // 物品颜色
            hardness = 1; // 开采硬度
            radioactivity = 0f; // 放射性
            explosiveness = 0f; // 爆炸性
            flammability = 0f; // 可燃性
            // 你可以在此添加更多属性
        }};
    }
}