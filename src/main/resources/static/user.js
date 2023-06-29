$(document).ready(function() {
    $('#pills-profile-tab').tab('show');
});

$(async function () {
    await getAuthUser();
});

async function getAuthUser() {
    try {
        const response = await fetch("/api/user/user");
        const data = await response.json();
        let role = data.roles[0].role.substring(5);
        let user = `
            <tr class="fs-5">
                <td>${data.id}</td>
                <td>${data.name}</td>
                <td>${data.surname}</td>
                <td>${data.username}</td>
                <td>${data.email}</td>
                <td>${role}</td>
            </tr>`;
        $('#userTableUserView').append(user);
    } catch (error) {
        console.log(error);
    }
}