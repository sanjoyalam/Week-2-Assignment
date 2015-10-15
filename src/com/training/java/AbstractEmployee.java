package com.training.java;

public abstract class AbstractEmployee {
        protected int empId;
        protected String Name;
        protected double Salary;
        protected Grade grade;
        protected EmployeeType empType;
        protected Department dept;
        protected DesignationType desig;
        
		public int getEmpId() {
			return empId;
		}
		public void setEmpId(int empId) {
			this.empId = empId;
		}
		public String getName() {
			return Name;
		}
		public void setName(String name) {
			Name = name;
		}
		public double getSalary() {
			return Salary;
		}
		public void setSalary(double salary) {
			Salary = salary;
		}
		public Grade getGrade() {
			return grade;
		}
		public void setGrade(Grade grade) {
			this.grade = grade;
		}
		public EmployeeType getEmpType() {
			return empType;
		}
		public void setEmpType(EmployeeType empType) {
			this.empType = empType;
		}
		public Department getDept() {
			return dept;
		}
		public void setDept(Department dept) {
			this.dept = dept;
		}
		public DesignationType getDesig() {
			return desig;
		}
		public void setDesig(DesignationType desig) {
			this.desig = desig;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((Name == null) ? 0 : Name.hashCode());
			long temp;
			temp = Double.doubleToLongBits(Salary);
			result = prime * result + (int) (temp ^ (temp >>> 32));
			result = prime * result + ((dept == null) ? 0 : dept.hashCode());
			result = prime * result + ((desig == null) ? 0 : desig.hashCode());
			result = prime * result + empId;
			result = prime * result + ((empType == null) ? 0 : empType.hashCode());
			result = prime * result + ((grade == null) ? 0 : grade.hashCode());
			return result;
		}
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			AbstractEmployee other = (AbstractEmployee) obj;
			if (Name == null) {
				if (other.Name != null)
					return false;
			} else if (!Name.equals(other.Name))
				return false;
			if (Double.doubleToLongBits(Salary) != Double.doubleToLongBits(other.Salary))
				return false;
			if (dept == null) {
				if (other.dept != null)
					return false;
			} else if (!dept.equals(other.dept))
				return false;
			if (desig != other.desig)
				return false;
			if (empId != other.empId)
				return false;
			if (empType != other.empType)
				return false;
			if (grade == null) {
				if (other.grade != null)
					return false;
			} else if (!grade.equals(other.grade))
				return false;
			return true;
		}
		@Override
		public String toString() {
			return "AbstractEmployee [empId=" + empId + ", Name=" + Name + ", Salary=" + Salary + ", grade=" + grade
					+ ", empType=" + empType + ", dept=" + dept + ", desig=" + desig + "]";
		}

}
