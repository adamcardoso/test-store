package org.teststore.test.wishlist;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;
import org.junit.Assert;
import org.junit.Test;
import org.teststore.data.dto.LoginDTO;
import org.teststore.data.dto.WishListDTO;
import org.teststore.data.factory.datafaker.LoginData;
import org.teststore.data.factory.datafaker.WishListData;
import org.teststore.page.home.HomePage;
import org.teststore.page.login.AuthenticationPage;
import org.teststore.page.wishlist.WishListPage;
import org.teststore.test.BaseTest;

public class WishListTest  extends BaseTest {
    HomePage homePage = new HomePage();
    LoginData loginData = new LoginData();
    AuthenticationPage authenticationPage = new AuthenticationPage();
    WishListPage wishListPage = new WishListPage();
    WishListData wishListData = new WishListData();

    @Test
    @Description("Validar adição de produto na lista de desejos padrão")
    @Story("Lista de desejos")
    @Severity(SeverityLevel.MINOR)
    public void validarAdicionarProdutoAListaDeDesejosPadrao() {
        homePage.clicarNoBtnSignin();

        LoginDTO usu = loginData.loginDadosValidos();
        authenticationPage.fazerLogin(usu.getEmail(), usu.getSenha());

        wishListPage.adicionandoProdutoAListaDeDesejosPadraoDoSite();

        homePage.clicarNoBtnLogout();
    }

    @Test
    @Description("Validar adição de produto na lista de desejos criada")
    @Story("Lista de desejos")
    @Severity(SeverityLevel.MINOR)
    public void validarAdicionarProdutoAListaDeDesejosCriada() {
        homePage.clicarNoBtnSignin();

        LoginDTO usu = loginData.loginDadosValidos();
        authenticationPage.fazerLogin(usu.getEmail(), usu.getSenha());

        WishListDTO wishListDTO = wishListData.cadastrarNomeDeListaDeDesejos();
        wishListPage.preencherNomeDaListaDeDesejo(wishListDTO);

        homePage.clicarNoBtnLogout();
    }
}
