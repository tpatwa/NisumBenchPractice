$(function () {
    $('#btnAdd').click(function () {
        var name = $('#txtEmpName').val();
        var age = $('#txtAge').val();
        var address = $('#txtAddress').val();


        if (name && age && address) {

            var emp = new Employee(name, age, address)
            $type({
                type: 'post',
                url: 'Index.aspx/AddEmployee',
                contentType: 'application/json; charset=utf-8',
                data: JSON.stringify({ empData: emp }),
                sucess: function (response) {


                },
                error: function (error) {
                    console.log(error);
                    $('#lblJson').val = error;
                }


            });

        }
        else {
            alert('All fields required');
        }

    });

    $('#btnGetEmp').click(function () {
        $ajax({
            type: 'GET',
            url: 'Index.aspx/GetEmployee',
            contentType: 'application/json; charset=utf-8',
            data: { empId: 1 },
            sucess: function (response) {
                var arr=JSON.parse(response.data)
                console.log(arr);
            },
            error: function (error) {
                                console.log(error);
            }



        });



    });

    });

function Employee(name,age,address)
{

    this.EmpName=name;
    this.EmpAge=age;
    this.EmpAddress=address;

}