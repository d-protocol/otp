import React from 'react';
import { User } from '../../models/User';

interface UserProfileProps {
  user: User;
}

const UserProfile: React.FC<UserProfileProps> = ({ user }) => {
  return (
    <div className="user-profile">
      <img src={user.avatar || '/default-avatar.png'} alt="User Avatar" className="user-avatar" />
      <h2>{user.username}</h2>
      <p>Email: {user.email || 'Not provided'}</p>
      <p>Trading Balance: ${user.tradingBalance.toFixed(2)}</p>
    </div>
  );
};

export default UserProfile;
