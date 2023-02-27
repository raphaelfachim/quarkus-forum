package fachim.raphael.api.infra.repository.impl;

import fachim.raphael.api.domain.User;
import fachim.raphael.api.infra.repository.interfaces.IUserRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Collection;

@ApplicationScoped
public class UserRepository extends GenericRepository<User> implements IUserRepository {

    @Override
    public Collection<User> list() {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<User> criteriaQuery = criteriaBuilder.createQuery(User.class);
        Root<User> root = criteriaQuery.from(User.class);

        CriteriaQuery<User> all = criteriaQuery.select(root);
        TypedQuery<User> typedQuery = em.createQuery(all);
        return typedQuery.getResultList();
    }

    @Override
    public User findById(Long id) {
        return em.find(User.class, id);
    }

}
