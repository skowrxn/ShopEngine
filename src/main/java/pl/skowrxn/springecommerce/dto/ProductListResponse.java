package pl.skowrxn.springecommerce.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductListResponse {

    private List<ProductDTO> products;
    private int page;
    private int pageSize;
    private int totalPages;
    private Long totalElements;
    private boolean lastPage;

}
