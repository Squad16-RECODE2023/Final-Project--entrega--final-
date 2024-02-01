import './Footer.css';
import logo from '../../assets/logo.png';

const Footer = () => {
  return (
   <footer className="footer-section">
  <div className="container">
    <div className="footer-cta pt-5 pb-5">
      <div className="row">
        <div className="col-xl-4 col-md-4 mb-30">
          <div className="single-cta">
            <i className="fas fa-map-marker-alt" />
            <div className="cta-text">
              <h4>Visite-nos</h4>
              <span>Rua Joaquim José da Silva Chavier 2104 </span>
            </div>
          </div>
        </div>

        <div className="col-xl-4 col-md-4 mb-30">
          <div className="single-cta">
            <i className="fas fa-phone" />
            <div className="cta-text">
              <h4>Contato</h4>
              <span> (81) 9876543210 </span>
            </div>
          </div>
        </div>

        <div className="col-xl-4 col-md-4 mb-30">
          <div className="single-cta">
            <i className="far fa-envelope-open" />
            <div className="cta-text">
              <h4>E-mail</h4>
              <span>equalizer_consultoria@yahoo.com</span>
            </div>
          </div>
        </div>
      </div>
    </div>

    <div className="footer-content pt-5 pb-5">
      <div className="row">
        <div className="col-xl-4 col-lg-4 mb-50">
          <div className="footer-widget">
            <div className="footer-logo">
              <a href="index.html"><img src={logo} className="img-fluid" alt="logo" /></a>
            </div>
            <div className="footer-text">
              <p>"Construindo Juntos, Celebrando a Diversidade: Nosso Compromisso com a Inclusão e o Crescimento Sustentável!" </p>
            </div>
            <div className="footer-social-icon">
              <span>Siga Nossas Redes</span>
              <a href="#"><i className="fab fa-facebook-f facebook-bg" /></a>
              <a href="#"><i className="fab fa-twitter twitter-bg" /></a>
              <a href="#"><i className="fab fa-google-plus-g google-bg" /></a>
            </div>
          </div>
        </div>

        <div className="col-xl-4 col-lg-4 col-md-6 mb-30">
          <div className="footer-widget">
            <div className="footer-widget-heading">
              <h3>Links Mais Acessados</h3>
            </div>
            <ul>
              <li><a href="#">Home</a></li>
              <li><a href="#">Sobre</a></li>
              <li><a href="#">serviços</a></li>
              <li><a href="#">Portfolio</a></li>
              <li><a href="#">Contato</a></li>
              <li><a href="#">Saiba Mais</a></li>
              <li><a href="#">Outros Serviços</a></li>
              <li><a href="#">Profissionais</a></li>
              <li><a href="#">Contate-nos</a></li>
              <li><a href="#">Novidades</a></li>
            </ul>
          </div>
        </div>
        
        <div className="col-xl-4 col-lg-4 col-md-6 mb-50">
          <div className="footer-widget">
            <div className="footer-widget-heading">
              <h3>Inscreva-se.</h3>
            </div>
            <div className="footer-text mb-25">
              <p>Não Fique de Fora das Últimas Novidades. </p>
            </div>
            <div className="subscribe-form">
              <form action="#">
                <input type="text" placeholder="Email Address" />
                <button><i className="fab fa-telegram-plane" /></button>
              </form>
            </div>
          </div>
        </div>
      </div>
    </div>
  </div>
  <div className="copyright-area">
    <div className="container">
      <div className="row">
        <div className="col-xl-6 col-lg-6 text-center text-lg-left">
          <div className="copyright-text">
            <p>Copyright © 2023, All Right Reserved <a href="https://codepen.io/anupkumar92/">Equalizer</a></p>
          </div>
        </div>
        <div className="col-xl-6 col-lg-6 d-none d-lg-block text-right">
          <div className="footer-menu">
            <ul>
              <li><a href="#">Home</a></li>
              <li><a href="#">Termos</a></li>
              <li><a href="#">Privacidade</a></li>
              <li><a href="#">Politicas</a></li>
              <li><a href="#">Contate-nos</a></li>
            </ul>
          </div>
        </div>
      </div>
    </div>
  </div>
</footer>

  )
}

export default Footer