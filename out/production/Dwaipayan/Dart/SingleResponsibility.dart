class UserManager{

  bool authenticate(String userName, String password){
    return true;
  }

  void updateUserProfile(String userName, Map<String, dynamic> profile){
    print("User profile updated for $userName");
  }

}

class AuthManager{
  bool authenticate(String userName, String password){
    return true;
  }
}

class ProfileManager{
  void updateUserProfile(String userName, Map<String, dynamic> profile){
    print("User profile updated for $userName");
  }
}