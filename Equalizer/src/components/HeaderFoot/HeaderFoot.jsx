import { Button, Col, Row } from 'react-bootstrap';
import './HeaderFoot.css';
import food from '../../assets/food.png';

const HeaderFoot = () => {
  return (
    <div>
      <Row>
        <Col md={6}>
          <div className="h_footer">
            <div className="h_ftCona">
              <img src={food} alt="header-footer" className='img-fluid' />
            </div>
          </div>
        </Col>
        <Col md={6}>
          <div className="h_ftright">
            <div className="containerBox">
              <h1 style={{ color: '#3D3F42', fontWeight: "bold" }}>Acreditamos na Potencialização do Capital Humano.</h1>
              <p className='text-secondary my-4'>Oferecemos uma cultura de aceitação, onde cada indivíduo é valorizado, independentemente de sua origem, identidade de gênero ou habilidades.</p>
              <p className='text-secondary'>Ao unir-se a nós, você faz parte de uma comunidade que celebra a singularidade, incentiva o crescimento e abraça a inovação. </p>
              <div className="d-flex justify-content-between align-items-start w-50 mt-4">
                <Button className='bg_login fw-bold border-0'>Potencialize-se</Button>
                <Button className='contact_btn'>Cadastro</Button>
              </div>
            </div>
          </div>
        </Col>
      </Row>
    </div>

  )
}

export default HeaderFoot