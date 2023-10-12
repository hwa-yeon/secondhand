package capstone.secondhand.domain;

import capstone.secondhand.domain.enumeration.DeliveryAvailable;
import capstone.secondhand.domain.enumeration.ProductStatus;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class Product {

    @Id @GeneratedValue
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "seller_id")
    private User seller;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "buyer_id")
    private User buyer;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "brand_id")
    private Brand brand;

    private String name;
    private int price;

    @Enumerated(EnumType.STRING)
    private DeliveryAvailable deliveryAvailable;
    //
    private LocalDateTime purchaseData;
    private String imageUrl;
    private String description;

    @Enumerated(EnumType.STRING)
    private ProductStatus status;

    private int viewCount;
}
