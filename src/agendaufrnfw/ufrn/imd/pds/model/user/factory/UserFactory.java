package agendaufrnfw.ufrn.imd.pds.model.user.factory;

import agendaufrnfw.ufrn.imd.pds.model.user.User;

public interface UserFactory {

	public User createUser();
	
	public User createUserFromJson(String json);
}
