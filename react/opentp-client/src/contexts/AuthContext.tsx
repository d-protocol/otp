import React, { createContext, useState, useContext, useEffect } from 'react';
import { User } from '../models/User';

interface AuthContextType {
  user: User | null;
  login: (username: string, password: string) => Promise<void>;
  logout: () => void;
}

const AuthContext = createContext<AuthContextType | undefined>(undefined);

export const AuthProvider: React.FC = ({ children }) => {
  const [user, setUser] = useState<User | null>(null);

  const login = async (username: string, password: string) => {
    // Implement your login logic here
    // For example purposes, we'll set a mock user
    setUser({
      id: '1',
      username,
      avatar: '/default-avatar.png',
      email: `${username}@example.com`,
      tradingBalance: 10000,
    });
  };

  const logout = () => {
    setUser(null);
  };

  return (
    <AuthContext.Provider value={{ user, login, logout }}>
      {children}
    </AuthContext.Provider>
  );
};

export const useAuth = () => {
  const context = useContext(AuthContext);
  if (context === undefined) {
    throw new Error('useAuth must be used within an AuthProvider');
  }
  return context;
};