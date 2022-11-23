create table Student_Trigger(
	Student_RollNo int not null primary key,
    Student_FirstName varchar(100),
    Student_EnglishMarks int,
    Student_PhysicsMarks int,
    Student_ChemistryMarks int,
    Student_MathsMarks int,
    Student_TotalMakrs int,
    Student_Percentage int
    );


create trigger Student_Table_Marks
before insert
on 
Student_Trigger
for each row
set
new.Student_TotalMarks=new.Student_EnglishMarks+new.Student_PhysicsMarks+new.Student_ChemistryMarks
