package fachim.raphael.api.infra.repository.impl;

import fachim.raphael.api.domain.Question;
import fachim.raphael.api.infra.repository.interfaces.IQuestionRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Collection;

@ApplicationScoped
public class QuestionRepository extends GenericRepository<Question> implements IQuestionRepository {
    @Override
    public Collection<Question> list() {
        CriteriaBuilder criteriaBuilder = em.getCriteriaBuilder();
        CriteriaQuery<Question> criteriaQuery = criteriaBuilder.createQuery(Question.class);
        Root<Question> root = criteriaQuery.from(Question.class);

        CriteriaQuery<Question> all = criteriaQuery.select(root);
        TypedQuery<Question> typedQuery = em.createQuery(all);
        return typedQuery.getResultList();
    }

    @Override
    public Question findById(Long id) {
        return em.find(Question.class, id);
    }

}
