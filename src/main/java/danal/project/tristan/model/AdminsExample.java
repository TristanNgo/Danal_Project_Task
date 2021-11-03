package danal.project.tristan.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class AdminsExample {
    
    protected String orderByClause;

    
    protected boolean distinct;

    
    protected List<Criteria> oredCriteria;

    
    public AdminsExample() {
        oredCriteria = new ArrayList<>();
    }

    
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    
    public String getOrderByClause() {
        return orderByClause;
    }

    
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    
    public boolean isDistinct() {
        return distinct;
    }

    
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

   
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andFAdminIdIsNull() {
            addCriterion("F_ADMIN_ID is null");
            return (Criteria) this;
        }

        public Criteria andFAdminIdIsNotNull() {
            addCriterion("F_ADMIN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andFAdminIdEqualTo(String value) {
            addCriterion("F_ADMIN_ID =", value, "fAdminId");
            return (Criteria) this;
        }

        public Criteria andFAdminIdNotEqualTo(String value) {
            addCriterion("F_ADMIN_ID <>", value, "fAdminId");
            return (Criteria) this;
        }

        public Criteria andFAdminIdGreaterThan(String value) {
            addCriterion("F_ADMIN_ID >", value, "fAdminId");
            return (Criteria) this;
        }

        public Criteria andFAdminIdGreaterThanOrEqualTo(String value) {
            addCriterion("F_ADMIN_ID >=", value, "fAdminId");
            return (Criteria) this;
        }

        public Criteria andFAdminIdLessThan(String value) {
            addCriterion("F_ADMIN_ID <", value, "fAdminId");
            return (Criteria) this;
        }

        public Criteria andFAdminIdLessThanOrEqualTo(String value) {
            addCriterion("F_ADMIN_ID <=", value, "fAdminId");
            return (Criteria) this;
        }

        public Criteria andFAdminIdLike(String value) {
            addCriterion("F_ADMIN_ID like", value, "fAdminId");
            return (Criteria) this;
        }

        public Criteria andFAdminIdNotLike(String value) {
            addCriterion("F_ADMIN_ID not like", value, "fAdminId");
            return (Criteria) this;
        }

        public Criteria andFAdminIdIn(List<String> values) {
            addCriterion("F_ADMIN_ID in", values, "fAdminId");
            return (Criteria) this;
        }

        public Criteria andFAdminIdNotIn(List<String> values) {
            addCriterion("F_ADMIN_ID not in", values, "fAdminId");
            return (Criteria) this;
        }

        public Criteria andFAdminIdBetween(String value1, String value2) {
            addCriterion("F_ADMIN_ID between", value1, value2, "fAdminId");
            return (Criteria) this;
        }

        public Criteria andFAdminIdNotBetween(String value1, String value2) {
            addCriterion("F_ADMIN_ID not between", value1, value2, "fAdminId");
            return (Criteria) this;
        }

        public Criteria andFAdminPwIsNull() {
            addCriterion("F_ADMIN_PW is null");
            return (Criteria) this;
        }

        public Criteria andFAdminPwIsNotNull() {
            addCriterion("F_ADMIN_PW is not null");
            return (Criteria) this;
        }

        public Criteria andFAdminPwEqualTo(String value) {
            addCriterion("F_ADMIN_PW =", value, "fAdminPw");
            return (Criteria) this;
        }

        public Criteria andFAdminPwNotEqualTo(String value) {
            addCriterion("F_ADMIN_PW <>", value, "fAdminPw");
            return (Criteria) this;
        }

        public Criteria andFAdminPwGreaterThan(String value) {
            addCriterion("F_ADMIN_PW >", value, "fAdminPw");
            return (Criteria) this;
        }

        public Criteria andFAdminPwGreaterThanOrEqualTo(String value) {
            addCriterion("F_ADMIN_PW >=", value, "fAdminPw");
            return (Criteria) this;
        }

        public Criteria andFAdminPwLessThan(String value) {
            addCriterion("F_ADMIN_PW <", value, "fAdminPw");
            return (Criteria) this;
        }

        public Criteria andFAdminPwLessThanOrEqualTo(String value) {
            addCriterion("F_ADMIN_PW <=", value, "fAdminPw");
            return (Criteria) this;
        }

        public Criteria andFAdminPwLike(String value) {
            addCriterion("F_ADMIN_PW like", value, "fAdminPw");
            return (Criteria) this;
        }

        public Criteria andFAdminPwNotLike(String value) {
            addCriterion("F_ADMIN_PW not like", value, "fAdminPw");
            return (Criteria) this;
        }

        public Criteria andFAdminPwIn(List<String> values) {
            addCriterion("F_ADMIN_PW in", values, "fAdminPw");
            return (Criteria) this;
        }

        public Criteria andFAdminPwNotIn(List<String> values) {
            addCriterion("F_ADMIN_PW not in", values, "fAdminPw");
            return (Criteria) this;
        }

        public Criteria andFAdminPwBetween(String value1, String value2) {
            addCriterion("F_ADMIN_PW between", value1, value2, "fAdminPw");
            return (Criteria) this;
        }

        public Criteria andFAdminPwNotBetween(String value1, String value2) {
            addCriterion("F_ADMIN_PW not between", value1, value2, "fAdminPw");
            return (Criteria) this;
        }

        public Criteria andFNameIsNull() {
            addCriterion("F_NAME is null");
            return (Criteria) this;
        }

        public Criteria andFNameIsNotNull() {
            addCriterion("F_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andFNameEqualTo(String value) {
            addCriterion("F_NAME =", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotEqualTo(String value) {
            addCriterion("F_NAME <>", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThan(String value) {
            addCriterion("F_NAME >", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameGreaterThanOrEqualTo(String value) {
            addCriterion("F_NAME >=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThan(String value) {
            addCriterion("F_NAME <", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLessThanOrEqualTo(String value) {
            addCriterion("F_NAME <=", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameLike(String value) {
            addCriterion("F_NAME like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotLike(String value) {
            addCriterion("F_NAME not like", value, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameIn(List<String> values) {
            addCriterion("F_NAME in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotIn(List<String> values) {
            addCriterion("F_NAME not in", values, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameBetween(String value1, String value2) {
            addCriterion("F_NAME between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFNameNotBetween(String value1, String value2) {
            addCriterion("F_NAME not between", value1, value2, "fName");
            return (Criteria) this;
        }

        public Criteria andFStatusIsNull() {
            addCriterion("F_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andFStatusIsNotNull() {
            addCriterion("F_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andFStatusEqualTo(String value) {
            addCriterion("F_STATUS =", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusNotEqualTo(String value) {
            addCriterion("F_STATUS <>", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusGreaterThan(String value) {
            addCriterion("F_STATUS >", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusGreaterThanOrEqualTo(String value) {
            addCriterion("F_STATUS >=", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusLessThan(String value) {
            addCriterion("F_STATUS <", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusLessThanOrEqualTo(String value) {
            addCriterion("F_STATUS <=", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusLike(String value) {
            addCriterion("F_STATUS like", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusNotLike(String value) {
            addCriterion("F_STATUS not like", value, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusIn(List<String> values) {
            addCriterion("F_STATUS in", values, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusNotIn(List<String> values) {
            addCriterion("F_STATUS not in", values, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusBetween(String value1, String value2) {
            addCriterion("F_STATUS between", value1, value2, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFStatusNotBetween(String value1, String value2) {
            addCriterion("F_STATUS not between", value1, value2, "fStatus");
            return (Criteria) this;
        }

        public Criteria andFLevelIsNull() {
            addCriterion("F_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andFLevelIsNotNull() {
            addCriterion("F_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andFLevelEqualTo(String value) {
            addCriterion("F_LEVEL =", value, "fLevel");
            return (Criteria) this;
        }

        public Criteria andFLevelNotEqualTo(String value) {
            addCriterion("F_LEVEL <>", value, "fLevel");
            return (Criteria) this;
        }

        public Criteria andFLevelGreaterThan(String value) {
            addCriterion("F_LEVEL >", value, "fLevel");
            return (Criteria) this;
        }

        public Criteria andFLevelGreaterThanOrEqualTo(String value) {
            addCriterion("F_LEVEL >=", value, "fLevel");
            return (Criteria) this;
        }

        public Criteria andFLevelLessThan(String value) {
            addCriterion("F_LEVEL <", value, "fLevel");
            return (Criteria) this;
        }

        public Criteria andFLevelLessThanOrEqualTo(String value) {
            addCriterion("F_LEVEL <=", value, "fLevel");
            return (Criteria) this;
        }

        public Criteria andFLevelLike(String value) {
            addCriterion("F_LEVEL like", value, "fLevel");
            return (Criteria) this;
        }

        public Criteria andFLevelNotLike(String value) {
            addCriterion("F_LEVEL not like", value, "fLevel");
            return (Criteria) this;
        }

        public Criteria andFLevelIn(List<String> values) {
            addCriterion("F_LEVEL in", values, "fLevel");
            return (Criteria) this;
        }

        public Criteria andFLevelNotIn(List<String> values) {
            addCriterion("F_LEVEL not in", values, "fLevel");
            return (Criteria) this;
        }

        public Criteria andFLevelBetween(String value1, String value2) {
            addCriterion("F_LEVEL between", value1, value2, "fLevel");
            return (Criteria) this;
        }

        public Criteria andFLevelNotBetween(String value1, String value2) {
            addCriterion("F_LEVEL not between", value1, value2, "fLevel");
            return (Criteria) this;
        }

        public Criteria andFRegDtIsNull() {
            addCriterion("F_REG_DT is null");
            return (Criteria) this;
        }

        public Criteria andFRegDtIsNotNull() {
            addCriterion("F_REG_DT is not null");
            return (Criteria) this;
        }

        public Criteria andFRegDtEqualTo(Date value) {
            addCriterion("F_REG_DT =", value, "fRegDt");
            return (Criteria) this;
        }

        public Criteria andFRegDtNotEqualTo(Date value) {
            addCriterion("F_REG_DT <>", value, "fRegDt");
            return (Criteria) this;
        }

        public Criteria andFRegDtGreaterThan(Date value) {
            addCriterion("F_REG_DT >", value, "fRegDt");
            return (Criteria) this;
        }

        public Criteria andFRegDtGreaterThanOrEqualTo(Date value) {
            addCriterion("F_REG_DT >=", value, "fRegDt");
            return (Criteria) this;
        }

        public Criteria andFRegDtLessThan(Date value) {
            addCriterion("F_REG_DT <", value, "fRegDt");
            return (Criteria) this;
        }

        public Criteria andFRegDtLessThanOrEqualTo(Date value) {
            addCriterion("F_REG_DT <=", value, "fRegDt");
            return (Criteria) this;
        }

        public Criteria andFRegDtIn(List<Date> values) {
            addCriterion("F_REG_DT in", values, "fRegDt");
            return (Criteria) this;
        }

        public Criteria andFRegDtNotIn(List<Date> values) {
            addCriterion("F_REG_DT not in", values, "fRegDt");
            return (Criteria) this;
        }

        public Criteria andFRegDtBetween(Date value1, Date value2) {
            addCriterion("F_REG_DT between", value1, value2, "fRegDt");
            return (Criteria) this;
        }

        public Criteria andFRegDtNotBetween(Date value1, Date value2) {
            addCriterion("F_REG_DT not between", value1, value2, "fRegDt");
            return (Criteria) this;
        }

        public Criteria andFModiDtIsNull() {
            addCriterion("F_MODI_DT is null");
            return (Criteria) this;
        }

        public Criteria andFModiDtIsNotNull() {
            addCriterion("F_MODI_DT is not null");
            return (Criteria) this;
        }

        public Criteria andFModiDtEqualTo(Date value) {
            addCriterion("F_MODI_DT =", value, "fModiDt");
            return (Criteria) this;
        }

        public Criteria andFModiDtNotEqualTo(Date value) {
            addCriterion("F_MODI_DT <>", value, "fModiDt");
            return (Criteria) this;
        }

        public Criteria andFModiDtGreaterThan(Date value) {
            addCriterion("F_MODI_DT >", value, "fModiDt");
            return (Criteria) this;
        }

        public Criteria andFModiDtGreaterThanOrEqualTo(Date value) {
            addCriterion("F_MODI_DT >=", value, "fModiDt");
            return (Criteria) this;
        }

        public Criteria andFModiDtLessThan(Date value) {
            addCriterion("F_MODI_DT <", value, "fModiDt");
            return (Criteria) this;
        }

        public Criteria andFModiDtLessThanOrEqualTo(Date value) {
            addCriterion("F_MODI_DT <=", value, "fModiDt");
            return (Criteria) this;
        }

        public Criteria andFModiDtIn(List<Date> values) {
            addCriterion("F_MODI_DT in", values, "fModiDt");
            return (Criteria) this;
        }

        public Criteria andFModiDtNotIn(List<Date> values) {
            addCriterion("F_MODI_DT not in", values, "fModiDt");
            return (Criteria) this;
        }

        public Criteria andFModiDtBetween(Date value1, Date value2) {
            addCriterion("F_MODI_DT between", value1, value2, "fModiDt");
            return (Criteria) this;
        }

        public Criteria andFModiDtNotBetween(Date value1, Date value2) {
            addCriterion("F_MODI_DT not between", value1, value2, "fModiDt");
            return (Criteria) this;
        }
    }

    
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}