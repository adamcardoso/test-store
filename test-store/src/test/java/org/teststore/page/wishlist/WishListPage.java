package org.teststore.page.wishlist;

import org.openqa.selenium.By;
import org.teststore.data.dto.WishListDTO;
import org.teststore.page.BasePage;

public class WishListPage extends BasePage {
    private static final By msgPopularProducts = By.cssSelector("#content section:nth-child(2) .products-section-title");
    private static final By btnWishList = By.cssSelector("#content > section:nth-child(2) > div > div:nth-child(1) > article > div > button");
    private static final By btnMyWishList = By.cssSelector(".wishlist-list > .wishlist-list-item");
    private static final By btnCreateNewWishList = By.cssSelector("#footer > div.footer-container > div > div:nth-child(1) > div.wishlist-add-to > div.wishlist-modal.modal.fade.show > div > div > div.modal-footer > a");
    private static final By inputWishListName = By.cssSelector("#input2");
    private static final By btnCreateWishList = By.cssSelector(".text-primary.wishlist-add-to-new");
    private static final By btnWishListCreated = By.cssSelector("li:nth-of-type(2) > p");
    private static final By btnMyAccount = By.cssSelector("#_desktop_user_info > div > a.account");
    private static final By btnMyWishLists = By.cssSelector("#wishlist-link > span");
    private static final By btnDelete = By.cssSelector("#content > div > ul > li:nth-child(2) > a > div > button:nth-child(2)");
    private static final By txtDeleteWishList = By.cssSelector("#footer > div.footer-container > div > div:nth-child(1) > div.wishlist-delete > div.wishlist-modal.modal.fade.show > div > div > div.modal-header > h5"); //Delete wishlist
    private static final By txtDeleteRemoveProductFromWishlist = By.cssSelector(".wishlist-delete > div[role='dialog'] > div[role='document'] .modal-title");
    private static final By btnDeleteConfirmation = By.cssSelector("#footer > div.footer-container > div > div:nth-child(1) > div.wishlist-delete > div.wishlist-modal.modal.fade.show > div > div > div.modal-footer > button.btn.btn-primary");
    private static final By btnDeleteConfirmation2 = By.cssSelector(".wishlist-delete > div[role='dialog'] > div[role='document'] .btn.btn-primary");
    private static final By btnCreateNewWishListConfirmation = By.cssSelector(".wishlist-create > div[role='dialog'] > div[role='document'] .btn.btn-primary");
    private static final By btnListWishLists = By.cssSelector(".wishlist-list-item-title");
    private static final By btnDeleteProductFromWishList = By.cssSelector(".wishlist-button-add > .material-icons");
    private static final By btnHomePage = By.cssSelector("ol > li:nth-of-type(1) > a > span");

    private void clicarNoBtnDeAdicionarAListaDeDesejos(){
        clicar(btnWishList);
    }

    private void clicarNoBtnDeConfirmacaoDeCriacaoDeNovaListaDeDesejos(){
        clicar(btnCreateNewWishListConfirmation);
    }

    private void clicarNoBtnHome(){
        clicar(btnHomePage);
    }

    private void clicarNoBtnDeListarTodasAsListasDeDesejos(){
        clicar(btnListWishLists);
    }

    private void clicarNoBtnDeAdicionarAListaDeDesejosPadrao(){
        clicar(btnMyWishList);
    }

    private void clicarNoBtnDeDeletarProdutoDaListaDeDesejos(){
        clicar(btnDeleteProductFromWishList);
    }

    private String verificarMsmDeProdutosPopulares(){
        return lerTexto(msgPopularProducts);
    }

    private String verificarMsgRemoverProdutoDaLista(){
        return lerTexto(txtDeleteRemoveProductFromWishlist);
    }

    private void clicarNaListaDeDesejoCriada(){
        clicar(btnWishListCreated);
    }

    private String verificarMsgDeDeletarListaDeDesejo(){
        return lerTexto(txtDeleteWishList);
    }

    private void clicarNoBtnDeDeletarListaDeDesejos(){
        clicar(btnDelete);
    }

    private void clicarNoBtnDeConfirmacaoDeDelecao(){
        clicar(btnDeleteConfirmation);
    }

    private void clicarNoBtnDeConfirmacaoDeDelecao2(){
        clicar(btnDeleteConfirmation2);
    }

    private void clicarNoBtnMinhasListasDeDesejos(){
        clicar(btnMyWishLists);
    }

    private void clicarNoBtnCriarListaDeDesejos(){
        clicar(btnCreateWishList);
    }

    private void clicarNoBtnMinhaConta(){
        clicar(btnMyAccount);
    }

    private void clicarNoBtnDeCriarAListaDeDesejos(){
        clicar(btnCreateNewWishList);
    }

    public void preencherNomeDaListaDeDesejo(WishListDTO wishListDTO){
        verificarMsmDeProdutosPopulares();
        clicarNoBtnDeAdicionarAListaDeDesejos();
        clicarNoBtnCriarListaDeDesejos();
        preencherInput(inputWishListName, wishListDTO.getWishListName());
        clicarNoBtnDeConfirmacaoDeCriacaoDeNovaListaDeDesejos();
        clicarNaListaDeDesejoCriada();
        clicarNoBtnMinhaConta();
        clicarNoBtnMinhasListasDeDesejos();
        clicarNoBtnDeDeletarListaDeDesejos();
        verificarMsgDeDeletarListaDeDesejo();
        clicarNoBtnDeConfirmacaoDeDelecao();
        clicarNoBtnHome();
    }

    public void adicionandoProdutoAListaDeDesejosPadraoDoSite(){
        verificarMsmDeProdutosPopulares();
        clicarNoBtnDeAdicionarAListaDeDesejos();
        clicarNoBtnDeAdicionarAListaDeDesejosPadrao();
        clicarNoBtnMinhaConta();
        clicarNoBtnMinhasListasDeDesejos();
        clicarNoBtnDeListarTodasAsListasDeDesejos();
        clicarNoBtnDeDeletarProdutoDaListaDeDesejos();
        verificarMsgRemoverProdutoDaLista();
        clicarNoBtnDeConfirmacaoDeDelecao2();
        clicarNoBtnHome();
    }
}
