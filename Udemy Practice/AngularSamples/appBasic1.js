var HeaderCtrl = function($scope) {
    $scope.appDetails = {
        title: "Bookart",
        tagline: "We have 1 million books for you"
    };
}


var BookListController = function($scope){

    $scope.Books =[
        {
            imgURL:"book1.png",
            name: "Adultery",
            price: "205",
            rating: "4",
            binding: "PaperBook",
            publisher: "random house India",
            releaseDate: "12-08-2014",
            details:"Linda, in her thirties, begins to question the routine and her predicatbility "
        },
        {
            imgURL:"book1.png",
            name: "Adultery",
            price: "205",
            rating: "4",
            binding: "PaperBook",
            publisher: "random house India",
            releaseDate: "12-08-2014",
            details:"Linda, in her thirties, begins to question the routine and her predicatbility "
        },
        {
            imgURL:"book1.png",
            name: "Adultery",
            price: "205",
            rating: "4",
            binding: "PaperBook",
            publisher: "random house India",
            releaseDate: "12-08-2014",
            details:"Linda, in her thirties, begins to question the routine and her predicatbility "
        },
        {
            imgURL:"book1.png",
            name: "Adultery",
            price: "205",
            rating: "4",
            binding: "PaperBook",
            publisher: "random house India",
            releaseDate: "12-08-2014",
            details:"Linda, in her thirties, begins to question the routine and her predicatbility "
        },
        {
            imgURL:"book1.png",
            name: "Adultery",
            price: "205",
            rating: "4",
            binding: "PaperBook",
            publisher: "random house India",
            releaseDate: "12-08-2014",
            details:"Linda, in her thirties, begins to question the routine and her predicatbility "
        }
    ]
$scope.addToKart=function(book)
{
    console.log("Add to Kart" ,book);
}
}

