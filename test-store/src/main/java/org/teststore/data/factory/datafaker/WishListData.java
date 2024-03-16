package org.teststore.data.factory.datafaker;

import org.teststore.data.dto.WishListDTO;
import org.teststore.util.DataFakerGenerator;

public class WishListData {
    private final DataFakerGenerator dataFakerGenerator = new DataFakerGenerator();
    WishListDTO wishListDTO = new WishListDTO();

    public WishListDTO cadastrarNomeDeListaDeDesejos(){
        wishListDTO.setWishListName(dataFakerGenerator.nomeListaDeDesejos());
        return wishListDTO;
    }
}
