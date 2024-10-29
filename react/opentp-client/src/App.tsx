import "@blueprintjs/core/lib/css/blueprint.css";
import "@blueprintjs/icons/lib/css/blueprint-icons.css";
import "@blueprintjs/datetime/lib/css/blueprint-datetime.css";
import "flexlayout-react/style/dark.css";
import "normalize.css";
import React from 'react';
import './App.css';
import Login from './components/Login';
import log from 'loglevel';
import UserProfile from './components/User/UserProfile';

const App: React.FC = () => {
  log.setLevel("INFO")
  const user = {
    id: '1',
    username: 'John Doe',
    avatar: '/default-avatar.png',
    email: 'john.doe@example.com',
    tradingBalance: 10000,
  };
  return (

    <Login ><UserProfile user={user} /></Login>

  );
}

export default App;
