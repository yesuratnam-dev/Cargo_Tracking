
const name=document.getElementById('ContrackingId')


const form=document.getElementById('form')
const errorElement=document.getElementById('error')

form.addEventListener('submit',(e) =>
{
	let messages=[]
	
	if(name.value===''|| name.value==null)
	{
		messages.push("Consignment_Tracking_Id is required")
	}
	
	if(messages.length>0)
	{
		e.preventDefault()
		errorElement.innerText = messages.jion(',')
	}
}

);
