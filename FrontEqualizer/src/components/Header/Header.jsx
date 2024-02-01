import { Button, Col, Container, Row } from 'react-bootstrap';
import './Header.css';
import head_rightImg from '../../assets/img/banner-home-smal.png';
import curve from '../../assets/curve.png';
import coock from '../../assets/cook.png';
import delivery from '../../assets/delivery.png';
import thumbs from '../../assets/thumbs.png';
import HeaderFoot from '../HeaderFoot/HeaderFoot';

const Header = () => {
  return (
    <div className='mt-5'>
      {/* <Container id="first"> */}
      <Row id="first">
        <Col md={6}>
          <div id="sect1" className="head_left ms-auto justify-content-center align-items-center">
            <span className='h_subTitle'>D&I</span>

            <div className="w-75 mt-2 h_title">
              {/* <h1 style={{ color: '#FB9431' }}> Equalizer Consultoria </h1> */}
              <div className="d-flex my-4">
                <img src={curve} alt="curve" className='curve' />
              </div>

              <h1 style={{ color: '#fff' }}>Desbloqueie o Potencial da sua Organização com Diversidade e Inclusão</h1>
            </div>

            <div className="d-flex justify-content-between align-items-start w-50 mt-4">
              <Button className='bg_login fw-bold border-0'>Cadastre-se</Button>
              <Button className='contact_btn'>contate-nos</Button>
            </div>
          </div>
        </Col>

        <Col md={6}>
          {/* <div className="head_right"> */}
          <div className="imageContainer d-flex justify-content-end align-items-center shadow-sm rounded">
            <img src={head_rightImg} alt="headerr-image" className='head_rightImg' />
          </div>
          {/* </div> */}
        </Col>
      </Row>
      {/* </Container> */}

      <Container id="second" className="d-flex justify-content-center">
        <Row>
          <Col md={4}>
            <div id="box1" className="box">
              <div className="boxContianer d-flex">
                <div className="">
                  {/* <img src={coock} alt="coock" className='' style={{ width: '100%', height: '100%', objectFit: 'cover' }} /> */}
                  <img src={coock} alt="coock" className='icon-card'/>
                </div>
                <div className="w-100">
                  <h5 style={{ color: '#fff', fontWeight: 'bold' }}>Palestras</h5>
                  <p>Palestras Personalizadas com Profissionais Especializados em Pedagogia Laboral focada em D&I.</p>
                </div>
              </div>
            </div>
          </Col>

          <Col md={4}>
            <div id="box2" className="box">
              <div className="boxContianer d-flex">
                <div className="">
                  {/* <img src={delivery} alt="coock" className='' style={{ width: '90%', height: '100%', objectFit: 'cover' }} /> */}
                  <img src={delivery} alt="coock" className='icon-card'/>
                </div>
                <div className="w-100">
                  <h5 style={{ color: '#fff', fontWeight: 'bold' }}>Vídeoaula</h5>
                  <p >Plataforma EaD Acessível e Intuitiva repleta de Minicursos de Aperfeiçoamento em D&I.</p>
                </div>
              </div>
            </div>
          </Col>

          <Col md={4}>
            <div id="box3" className="box">
              <div className="boxContianer d-flex">
                <div className="">
                  {/* <img src={thumbs} alt="coock" className='' style={{ width: '90%', height: '100%', objectFit: 'cover' }} /> */}
                  <img src={thumbs} alt="coock" className='icon-card'/>
                </div>
                <div className="w-100">
                  <h5 style={{ color: '#fff', fontWeight: 'bold' }}>Artigos
                    <small className='ms-3 fw-normal'>
                    </small></h5>
                  <p >Acervo Atualizado Constantemente com Temas Mais Relevantes do Universo de D&I. </p>
                </div>
              </div>
            </div>
          </Col>
        </Row>  
      </Container>

      <div className="headerFoot my-4">
          <HeaderFoot />
        </div>
    </div>

  )
}

export default Header