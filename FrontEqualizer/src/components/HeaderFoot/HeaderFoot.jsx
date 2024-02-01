import { Button } from 'react-bootstrap';
import './HeaderFoot.css';
import food from '../../assets/food.png';

const HeaderFoot = () => {
  return (
    <div id="third">
      <div className="containerBox d-flex flex-column flex-md-row">
        <div className="h_footer">
          <div className="h_ftCona">
            <img src={food} alt="header-footer" className='img-fluid' />
          </div>
        </div>

        <div id="text" className="h_ftright text-center text-md-start">
          <h1 style={{ color: '#fff', fontWeight: "bold" }}>Acreditamos na Potencialização do Capital Humano.</h1>

          <p className=' my-4'>Oferecemos uma cultura de aceitação, onde cada indivíduo é valorizado, independentemente de sua origem, identidade de gênero ou habilidades.</p>
          <p className=''>Ao unir-se a nós, você faz parte de uma comunidade que celebra a singularidade, incentiva o crescimento e abraça a inovação. </p>

          <div className="mt-4">
            <Button className='bg_login fw-bold border-0'>Potencialize-se</Button>
          </div>
        </div>
      </div>
    </div>
  );
};

export default HeaderFoot;
