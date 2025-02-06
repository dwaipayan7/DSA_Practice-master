class UserManager{
  bool authenticateUser(String username, String password){
    return true;
  }
}

class ProfileManager{

  void updateUserProfile(String username, Map<String, dynamic> profiles){
    print("User Profile Updated For $username");
  }

}