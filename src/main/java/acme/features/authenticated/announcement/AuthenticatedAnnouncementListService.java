
package acme.features.authenticated.announcement;

import java.util.Calendar;
import java.util.Collection;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.announcements.Announcement;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractListService;

@Service
public class AuthenticatedAnnouncementListService implements AbstractListService<Authenticated, Announcement> {

	@Autowired
	AuthenticatedAnnouncementRepository repository;


	@Override
	public boolean authorise(final Request<Announcement> request) {
		// TODO Auto-generated method stub
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<Announcement> request, final Announcement entity, final Model model) {
		// TODO Auto-generated method stub
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "moment", "title");

	}

	@Override
	public Collection<Announcement> findMany(final Request<Announcement> request) {
		// TODO Auto-generated method stub
		assert request != null;

		Collection<Announcement> result;

		Calendar aux = Calendar.getInstance();

		Date date2 = new Date();
		aux.setTime(date2);
		aux.add(Calendar.MONTH, -2);
		Date month2 = aux.getTime();

		result = this.repository.findAuthenticated(month2);

		return result;
	}

}
