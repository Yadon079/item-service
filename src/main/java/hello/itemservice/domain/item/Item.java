package hello.itemservice.domain.item;

import lombok.Data;


@Data // 모든 걸 다 만들어줌. 위험함. 실제 서비스에서는 @Getter, @Setter를 사용하는 것이 좋음.
public class Item {

  private Long id;
  private String itemName;
  private Integer price;
  private Integer quantity;

  public Item() {
  }

  public Item(String itemName, Integer price, Integer quantity) {
    this.itemName = itemName;
    this.price = price;
    this.quantity = quantity;
  }

}
