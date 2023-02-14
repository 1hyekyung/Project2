package chap19.sec08;

import lombok.AllArgsConstructor;
import lombok.Data; 
import lombok.NoArgsConstructor; 
@Data // @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode을 한꺼번에 설정해줌
@NoArgsConstructor   // 파라미터 없는 기본 생성자를 생성함
@AllArgsConstructor  // 모든 필드 값을 파라미터로 받는 생성자를 만들어줌
public class Product {
  private int no;
  private String name;
  private int price;
  private int stock;
}

