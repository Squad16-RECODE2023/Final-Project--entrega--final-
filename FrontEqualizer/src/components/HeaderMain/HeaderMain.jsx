import Header from '../Header/Header';
// import HeaderSecondary from '../HeaderSecondary/HeaderSecondary';
import Topbar from '../Topbar/Topbar';
import './HeaderMain.css';


const HeaderMain = () => {
  return (
    <div className='h_main'>
      <Topbar/>
      <Header/>
      {/* <HeaderSecondary/> */}
    </div>
  )
}

export default HeaderMain